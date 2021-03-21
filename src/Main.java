public class Main {
    public static void main(String[] args) {
        try {
            checkArray(creatingAnArray());
        }catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }

    }
    /**
     * Вычисление суммы ячеек массива
     *
     * @param arr1
     * @throws MyArrayDataException при некорректном значении ячейки
     * @throws MyArraySizeException при некорректном размере массива
     *
     * */
    public static void checkArray(String[][] arr1) throws MyArraySizeException, MyArrayDataException{
        int sumOfArray = 0;
        if (arr1.length != 4){
            throw new MyArraySizeException("столб не соответсвует размеру");
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i].length != 4 ){
                throw new MyArraySizeException("строка не соотвествует рамзеру");
            }
            for (int j = 0; j < arr1[i].length; j++) {
                try{
                    sumOfArray += Integer.parseInt(arr1[i][j]);
                }catch (NumberFormatException e){
                    System.out.println("некорректая ячейка массива: " + i + " " + j + "");
                    throw new MyArrayDataException();
                }

            }
        }
        System.out.println("Сумма всех ячеек массива: " + sumOfArray);
    }
    /**
     *
     * Задание массива
     *
     * */
    public static String [][] creatingAnArray(){
        String [][] arr1 = {
                {"1", "3", "3","4"},
                {"1", "3", "3","4"},
                {"1", "3", "3","4"},
                {"1", "3", "3","4"},

        };
        return arr1;
    }
}



