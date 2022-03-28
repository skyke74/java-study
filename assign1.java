
public class assign1 {

    public static void main(String[] args) {

        char startValue = Character.MIN_VALUE;
        char endValue = Character.MAX_VALUE;
        int count=0;
        int tmp=0;
        
        for(int i=startValue; i<=endValue; i++){
            if(count<3){
                switch((char)i){
                    case '김':
                        System.out.format("0x%04X%n",i);
                        count++;
                        break;
                    case '세':
                        System.out.format("0x%04X%n",i);
                        count++;
                        break;
                    case '영':
                        System.out.format("0x%04X%n",i);
                        count++;
                }
                tmp++;
            }
            break;
        }
        System.out.println(tmp);
    }
}