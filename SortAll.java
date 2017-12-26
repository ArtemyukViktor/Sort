import java.util.Arrays;
import java.util.Scanner;
public class SortAll {
	
	public static void main (String args[]){
		
		Scanner input = new Scanner (System.in);
		System.out.print("Vvedite stroky");
		String stroka = input.nextLine();
		String[] s = stroka.split(" ");
		int povtoriv =0;
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length-1-povtoriv; j++) {
				char [] ch = s[j].toCharArray();
				char [] ch1 = s[j+1].toCharArray();
				
				for (int k = 0; k < Math.min(ch.length, ch1.length); k++) {	
				//if (ch[k]==ch1[k]){
					//continue;
				//}
					
				if (ch[k]>ch1[k]){
					String first = s[j];
					String second = s[j+1];
					s[j]=second;
					s[j+1]=first;
					break;
					
				}else if(ch[k]<ch1[k]) {
					break;
				}
			}
			} povtoriv++;
		} System.out.println(Arrays.toString(s));		
	}
}
