
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s1=0,s2=0;
		for(int i=1;i<=100;i++)
		{
			s1+=i;
			s2+=(i*i);
		}
		s1*=s1;
		System.out.println(s1-s2);
	}

}
