package kovalenko;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import kovalenko.CurrencyCourse;

public class CurrencyCourseUpdater {
    public static final String SITE = "http://finance.i.ua"; // сайт, откуда берем данные
    
    // под какой браузер будем косить
    final static String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.146 Safari/537.36";
    
    // метод, возвращающий массив малют
    public CurrencyCourse[] getCurrenctCourses() {
        HttpURLConnection urlConnection = null; // штука, с помощью которой будем получать исходный код страницы
  
        try {
            URL url = new URL(SITE); // ссылка на сайт
            urlConnection = (HttpURLConnection) url.openConnection(); // открыли соединение
            
            // скорее всего не обязательно НАЧАЛО
            urlConnection.addRequestProperty("User-Agent", USER_AGENT); // притворились каким-то браузером
            urlConnection.addRequestProperty("Accept-Language", "ru-RU,ru;q=0.8,en-US;q=0.6,en;q=0.4"); // сказали, что говорим по-русски и по-английски
            // скорее всего не обязательно КОНЕЦ
            
            InputStream in = new BufferedInputStream(urlConnection.getInputStream()); // записали исходный код страницы в поток
            
            String pageSourceCode = inputStreamToString(in); // взяли из потока исходный код страницы в обычную строку
            
            // массив для трех валют по три значения (покупка, продажа, НБУ) 3 * 3 = 9
            double values[] = new double[9];
            int i = 0; // счетчик
            
            // цикл выполнится ровно 9 раз
            while (pageSourceCode.contains("<td><big>") && i<9) { // пока исходный код страницы содержит строки со значениями
                pageSourceCode = pageSourceCode.substring(pageSourceCode.indexOf("<td><big>") + 9); // удаляем все до первого значения
                values[i++] = Double.parseDouble(pageSourceCode.substring(0, pageSourceCode.indexOf("<"))); // запиливаем его в массив
            }
            
           // создаем пустой массив валют
           CurrencyCourse courses[] = new CurrencyCourse[3];
           String names[] = {"USD", "EUR", "RUB"}; // массив имен валют
            
            for (int j = 0, k = 0; j<3; ++j) // заполняем массив валют, изымая соответствующие значения курсов
                courses[j] = new CurrencyCourse(values[k++], values[k++], values[k++], names[j]);
            
            return courses; // возвращаем заполненный массив валют
        }
        catch (Exception e) {}
        return null;
    }
    
    // метод преобразования потока в строку
    private String inputStreamToString(InputStream inStream) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(inStream).useDelimiter("\\A");
		String result = new String(scanner.hasNext() ? scanner.next() : null);
		scanner.close();
	    return result;
    }
}