class Test{
    public static void printDiamondOdd(int n) {
        String characterToOutput = "";

        if( n % 2 == 0 ){
            System.out.println("n should be a number that is not divisible by 2 ");
        }else{
            int middle = (n-1)/2;
            for(int i = 0 ; i < n ;i++){
                for (int j = 0 ; j < n; j++){
                    if(i < (n+1)/2){
                        if(Math.abs(middle - j) < i+1){
                            characterToOutput += "# ";
                        }else{
                            characterToOutput += "  ";
                        }
                    }else{
                        if(Math.abs((middle  - j)) < (n-i)){
                            characterToOutput += "# ";
                        }else{
                            characterToOutput += "  ";
                        }
                    }
                }
                System.err.println(characterToOutput);
                characterToOutput = "";
            }
        }

        }
        public static void PrintDiamondRegular(int n) {
            int space = n - 1;
            for (int i = 0 ; i < 2*n; i++){
                String charactersLine = "";
                if(i <= n){
                    //adding the spaces
                    for (int j = 0 ; j <= space; j++){
                        charactersLine += " ";
                    }
                    //adding the lines 
                    for (int j = 0 ; j < i; j ++){
                        charactersLine += "# ";
                    }
                    space --;
                    System.out.println(charactersLine);
                }else{
                    if(i == n+1){
                        space = 0;
                    }
                    //adding the spaces 
                    for(int j = 0 ;j <= space; j++){
                        charactersLine += " ";
                    }
                    for(int j = 2*n; j > i ; j--){
                        charactersLine += "# ";
                    }

                    //adding the lines
                    
                    space ++;
                    System.err.println(charactersLine);
                }

            }
        }
        public static void main(String[] args) {
            printDiamondOdd(17);
            PrintDiamondRegular(6);
        }
}


