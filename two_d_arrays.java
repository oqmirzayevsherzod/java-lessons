public class two_d_arrays {
    public static void main(String[] args){

        // 2d arrays - An array where each element is an array
        //             Useful for storing a matrix of data

        char[][] telephone = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'},
                              {'*','0','#'}};

        for(char[] row : telephone){
            for(char number : row){
                System.out.print(number + " ");
            }
            System.out.println();
        }

        //String[] fruits = {"apple", "orange", "banana"};
        //String[] vegetables = {"potato", "onion", "carrot"};
        //String[] meats = {"chicken", "pork", "beef", "fish"};

        /*
        String[][] groceries = {{"apple", "orange", "banana"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "pork", "beef", "fish"}};

        groceries[1][2] = "celery";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }

         */
    }
}
