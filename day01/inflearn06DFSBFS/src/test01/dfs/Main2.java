package test01.dfs;

public class Main2 {

	//자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 
	//모두 출력하는 프로그램을 작성하세요
	//주어진 N=3일때, 시작값=1,(공집합은 출력안함.)
	//1 2 3
	//1 2
	//1 3
	//1
	//2 3
	//2
	//3
	static int n;//0 -> 3
	static int[] ch;//null -> [0,0,0,0]
	
	void dfs(int L) {//1 -> else -> 2 -> else -> 3 -> else -> 4
		if(L == n + 1) {
			String tmp = "";
			
			for (int i = 1; i <= n ; i++) {
				if(ch[i] == 1) tmp += (i+" ");
			}
			
			if(tmp.length()>0) {
				System.out.println(tmp);
			}
		}else {
			ch[L] = 1;//[0,1,0,0] -> [0,1,1,0] -> [0,1,1,1]
			dfs(L+1);
			
			ch[L] = 0;//L=3 : [0,1,1,0],L=2[0,1,0,0]
			dfs(L+1);//3+1,2+1
		}
		
	}
	
	public static void main(String[] args) {
		Main2 m = new Main2();
		n = 3;
		ch = new int[n+1];
		m.dfs(1);

	}//end main

}//end class
