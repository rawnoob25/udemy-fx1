package tryingBranching;

public class TryingBranching {
	public static void main(String[] args) {
		doSthg("ThisIsFun");
	}
	static void doSthg(String s){
		for (int i=0;i<s.length();i++){
			System.out.println(s.charAt(i)+" ");
		}
	}
}
