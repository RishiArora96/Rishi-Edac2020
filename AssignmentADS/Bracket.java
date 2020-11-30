public class Bracket {
	String inpstr = "";
	MyStack st;

	public Bracket() {
	  inpstr = "{}{}";
	  st = new MyStack();
	}
	public int checkmatch(){
		for (int i=0; i < inpstr.length(); i++)
			if (inpstr.charAt(i) == '{') {
				st.push(1);
			}
			else if (inpstr.charAt(i) == '}') {
				if (st.empty()) {
					System.out.println("Too many closing para");
					return -1;
				}
				st.pop();
			}
		if (st.empty()) {
			System.out.println("Good -- matching fine");
			return 1;
		}
		else {
			System.out.println("There are paras to be closed");
			return 0;
	   	}
	}
	public static void main(String[] args) {
		Bracket b = new Bracket();
		b.checkmatch();
	}
}
