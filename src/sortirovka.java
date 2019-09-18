public class sortirovka {

        public static void main(String[] args) {
            int [] gap=new int[10];

            for (int i = 0; i <gap.length ; i++) {
                gap[i]=(int)(Math.random()*100-50);
            }
            for (int i = 0; i <gap.length ; i++) {
                System.out.print(gap[i]+" ");
            }
            /*for (int i = 0; i <gap.length ; i++) {
                gap[i]=gap.length-i;
            }*/

            int left=0;
            int right=gap.length-1;
            while (left<=right){
                for (int i=right;i>left;i--){
                    if (gap[i-1]>gap[i]){
                        int get=gap[i];
                        gap[i]=gap[i-1];
                        gap[i-1]=get;
                    }

                } left++;
                for (int i=left;i<right;i++){
                    if (gap[i]>gap[i+1]){
                        int get=gap[i];
                        gap[i]=gap[i+1];
                        gap[i+1]=get;
                    }

                } right--;
            }
            System.out.println("\n");
            for (int i = 0; i <gap.length ; i++) {
                System.out.print(gap[i]+" | ");
            }
        }
    }
