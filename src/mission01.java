/*
    1. 1~8까지 랜덤한 숫자 배열을 생성
    2. 교환할 숫자 입력
    3. 정상적인 입력 들어왔을 경우 턴을 증가시켜 출력.
    4. 배열이 오름차순이 아닐경우 2부터 다시 반복
 */


import java.util.*;

public class mission01 {

    public static int[] arrMake(){
        int arr[] = new int[8];
        int num[] = {1,2,3,4,5,6,7,8};
        for(int i=0;i<8;i++){
            int index = (int)(Math.random()*8);
            if(num[index] == 0){
                while(num[index] == 0){
                    index = (int)(Math.random()*8);
                }
            }
            arr[i] = num[index];
            num[index] = 0;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = arrMake();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
