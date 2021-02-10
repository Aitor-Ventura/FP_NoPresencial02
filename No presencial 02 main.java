import es.ulpgc.eii.strings.StringUtils;

public class Main {
    /**
     * Prueba el método StringUtils.dates
     * @param input - ristra de búsqueda
     * @param expected - resultado esperado
     */
    static void test(String input, String expected) {
    	// Se informa del caso que se está probando
    	System.out.println("probando: dates(\"" + input + "\")");
    	
        // Llamada al método a probar
        String result = StringUtils.dates(input);
        
        // Comprobación de los resultados
        if (!result.equals(expected)) {
            System.out.print(">> Resultado erróneo, deberia ser: \"" + expected + "\"");
            System.out.println(" y es: \"" + result + "\"");
        } else {
            System.out.println(">> Resultado correcto: \"" + result + "\"");
        }        
    }

    /**
     * @param args
     */
    /**
     * Invoca a test para realizar múltiples pruebas de StringUtils.dates
     * @param args
     */
    public static void main(String[] args) {
        test("eiur758q4hpr", "");
        test("abcdefghi12/12/2012jklmnñopqrstuvwxyz", "12/12/2012");
        test("12/10/2013jklmnñopqrstuvwxyz", "12/10/2013");
        test("abcdefghi02/11/2011", "02/11/2011");
        test("10/09/2008abcdefghi12/12/2012jklmnñop14/02/2001qrstuvwxyz08/07/1999",
             "10/09/2008 12/12/2012 14/02/2001 08/07/1999");
    }

}
