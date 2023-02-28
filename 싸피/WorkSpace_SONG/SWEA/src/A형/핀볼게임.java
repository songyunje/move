package A형;



import java.io.*;
import java.util.*;

public class 핀볼게임{
	static int x,y,N,score,max;
	static int startx,starty;
	static int[][] map;
	static List<Integer> list6x = new ArrayList<>();
	static List<Integer> list7x = new ArrayList<>();
	static List<Integer> list8x = new ArrayList<>();
	static List<Integer> list9x = new ArrayList<>();
	static List<Integer> list10x = new ArrayList<>();
	static List<Integer> list6y = new ArrayList<>();
	static List<Integer> list7y = new ArrayList<>();
	static List<Integer> list8y = new ArrayList<>();
	static List<Integer> list9y = new ArrayList<>();
	static List<Integer> list10y = new ArrayList<>();

	static String direction;
	
	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		StringTokenizer st;	
		StringBuilder sb;

		int T = sc.nextInt();
//		int T = Integer.parseInt(br.readLine());

		
		for(int t=0;t<T;t++) {
			sb = new StringBuilder("#");
			
			N = sc.nextInt();
			map = new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					map[i][j]=sc.nextInt();
				}
			}
			
			
//			for(int i=0;i<N;i++) {
//				for(int j=0;j<N;j++) {
//					System.out.print(map[i][j]+" ");
//				}
//				System.out.println();
//			}
	
//			N = Integer.parseInt(br.readLine());
//			
//			// map 입력받음
//			map = new int[N][N];
//			for(int i=0;i<N;i++) {
//				st = new StringTokenizer(br.readLine()," ");
//				for(int j=0;j<N;j++) {
//					map[i][j]=Integer.parseInt(st.nextToken());
//				}
//			}
			
			
			
			// map 스캔하고 웜홀 위치 추적
			scan(map);
			
			
			max = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j] == 0) {
						run(i,j,"r");
						run(i,j,"l");
						run(i,j,"u");
						run(i,j,"d");
					}
				}
			}


			sb.append((t+1)+" "+max+"\n");
			bw.write(String.valueOf(sb));
			
	
		}
	
//		br.close();
		bw.flush();
		bw.close();
	}
	
	
	
	
	
	
	
	// 맵 스캔 후 웜홀 위치 추적
	static void scan(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if((arr[i][j]>=6)&&(arr[i][j]<=10)) {
					switch(arr[i][j]) {
						case 6: list6x.add(i);
								list6y.add(j);
								break;
						case 7: list7x.add(i);
								list7y.add(j);
								break;
						case 8: list8x.add(i);
								list8y.add(j);
								break;
						case 9: list9x.add(i);
								list9y.add(j);
								break;
						case 10: list10x.add(i);
								list10y.add(j);
								break;
					}
				}
			}
		}
	}
	
	static void run(int xx, int yy, String startingdirection) {
		score = 0;
		startx=xx;
		starty=yy;
		x=xx;
		y=yy;
		direction=startingdirection;
		if(startingdirection=="r") {
			moveright();
		}else if(startingdirection=="l") {
			moveleft();
		}else if(startingdirection=="u") {
			moveup();
		}else {
			movedown();
		}
	}
	
	// 이벤트 발생
	static void event(int num, String direction) {
//		System.out.println("이벤트 실행");
		if(num<=5 && num>0) {
			score++;
			block(num,direction);
		}else if(num>=6){
			wormhole(num,x,y,direction);
		}
	}
	
	
	// 웜홀 이벤트
	static void wormhole(int type, int xx, int yy,String direction) {
//		System.out.println("웜홀실행");
		switch(type) {
			case 6: if((xx==list6x.get(0))&&(yy==list6y.get(0))) {
				x=list6x.get(1);
				y=list6y.get(1);
				if(direction=="r" && y==N-1) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("l");
				}else if(direction=="l" && y==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("r");
				}else if(direction=="u" && x==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("d");
				}else if(direction=="d" && y==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("u");
				}else {
					move(direction);					
				}
				
			}else {
				x=list6x.get(0);
				y=list6y.get(0);
				if(direction=="r" && y==N-1) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("l");
				}else if(direction=="l" && y==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("r");
				}else if(direction=="u" && x==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("d");
				}else if(direction=="d" && y==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("u");
				}else {
					move(direction);					
				}
			}break;
			
			case 7: if((xx==list7x.get(0))&&(yy==list7y.get(0))) {
				x=list7x.get(1);
				y=list7y.get(1);
				if(direction=="r" && y==N-1) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("l");
				}else if(direction=="l" && y==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("r");
				}else if(direction=="u" && x==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("d");
				}else if(direction=="d" && y==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("u");
				}else {
					move(direction);					
				}
			}else {
				x=list7x.get(0);
				y=list7y.get(0);
				if(direction=="r" && y==N-1) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("l");
				}else if(direction=="l" && y==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("r");
				}else if(direction=="u" && x==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("d");
				}else if(direction=="d" && y==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("u");
				}else {
					move(direction);					
				}
			}break;
			
			case 8: if((xx==list8x.get(0))&&(yy==list8y.get(0))) {
				x=list8x.get(1);
				y=list8y.get(1);
				if(direction=="r" && y==N-1) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("l");
				}else if(direction=="l" && y==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("r");
				}else if(direction=="u" && x==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("d");
				}else if(direction=="d" && y==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("u");
				}else {
					move(direction);					
				}
			}else {
				x=list8x.get(0);
				y=list8y.get(0);
				if(direction=="r" && y==N-1) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("l");
				}else if(direction=="l" && y==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("r");
				}else if(direction=="u" && x==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("d");
				}else if(direction=="d" && y==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("u");
				}else {
					move(direction);					
				}
			}break;
			
			case 9: if((xx==list9x.get(0))&&(yy==list9y.get(0))) {
				x=list9x.get(1);
				y=list9y.get(1);
				if(direction=="r" && y==N-1) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("l");
				}else if(direction=="l" && y==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("r");
				}else if(direction=="u" && x==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("d");
				}else if(direction=="d" && y==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("u");
				}else {
					move(direction);					
				}
			}else {
				x=list9x.get(0);
				y=list9y.get(0);
				if(direction=="r" && y==N-1) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("l");
				}else if(direction=="l" && y==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("r");
				}else if(direction=="u" && x==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("d");
				}else if(direction=="d" && y==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("u");
				}else {
					move(direction);					
				}
			}break;
			
			case 10: if((xx==list10x.get(0))&&(yy==list10y.get(0))) {
				x=list10x.get(1);
				y=list10y.get(1);
				if(direction=="r" && y==N-1) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("l");
				}else if(direction=="l" && y==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("r");
				}else if(direction=="u" && x==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("d");
				}else if(direction=="d" && y==0) {
					score+=2;
					x=list6x.get(0);
					y=list6y.get(0);
					move("u");
				}else {
					move(direction);					
				}
			}else {
				x=list10x.get(0);
				y=list10y.get(0);
				if(direction=="r" && y==N-1) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("l");
				}else if(direction=="l" && y==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("r");
				}else if(direction=="u" && x==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("d");
				}else if(direction=="d" && y==0) {
					score+=2;
					x=list6x.get(1);
					y=list6y.get(1);
					move("u");
				}else {
					move(direction);					
				}
			}break;
			
		}
	}
	
	// 블록 이벤트
	static void block(int type, String direction) {
//		System.out.println("블록 실행");
		switch(type) {
			case 1: if(direction=="l") {
				if(x==0) {
					score+=2;
					moveright();
				}else {
					moveup();
				}
			}else if(direction=="r") {
				moveleft();
			}else if(direction=="u") {
				movedown();
			}else if(direction=="d") {
				if(y==N-1) {
					score+=2;
					moveup();
				}else {
					moveright();
				}
			}break;
			
			case 2: if(direction=="l") {
				if(x==N-1) {
					score+=2;
					moveright();
				}else {
					movedown();
				}
			}else if(direction=="r") {
				moveleft();
			}else if(direction=="u") {
				if(y==N-1) {
					score+=2;
					movedown();
				}else {
					moveright();
				}
			}else if(direction=="d") {
				moveup();
			}break;
			
			case 3: if(direction=="l") {
				moveright();
			}else if(direction=="r") {
				if(x==N-1) {
					score+=2;
					moveleft();
				}else {
					movedown();
				}
			}else if(direction=="u") {
				if(y==0) {
					score+=2;
					movedown();
				}else {
					moveleft();
				}
			}else if(direction=="d") {
				moveup();
			}break;
			
			case 4: if(direction=="l") {
				moveright();
			}else if(direction=="r") {
				if(x==0) {
					score+=2;
					moveleft();
				}else {
					moveup();
				}
			}else if(direction=="u") {
				movedown();
			}else if(direction=="d") {
				if(y==0) {
					score+=2;
					moveup();
				}else {
					moveleft();
				}
			}break;
			
			case 5: if(direction=="l") {
				moveright();
			}else if(direction=="r") {
				moveleft();
			}else if(direction=="u") {
				movedown();
			}else if(direction=="d") {
				moveup();
			}break;
		
		
		
		}
			
	}
	
	// 이동
	static void move(String d) {
		if(d=="r") {
			moveright();
		}else if(d=="l") {
			moveleft();
		}else if(d=="u") {
			moveup();
		}else {
			movedown();
		}
	}
	
	
	// 위쪽으로 이동
	static void moveup() {
//		System.out.println("up실행");
		direction = "u";
		while(x>0) {
			x--;
			if(map[x][y] >=1 && map[x][y] <=10 && !(x==startx && y==starty)) {
				event(map[x][y],direction);
				break;
			}
			if(map[x][y] ==0 && (x==0) && !(x==startx && y==starty)) {
				score++;
				movedown();
				break;
			}
			if(map[x][y] == -1 || (x==startx && y==starty)){
				max=Math.max(max, score);
				break;
			}
		}
	}
	
	
	// 아래쪽으로 이동
	static void movedown() {
//		System.out.println("down실행");
		direction = "d";
		while(x<N-1) {
			x++;
			if(map[x][y] >=1 && map[x][y] <=10 && !(x==startx && y==starty)) {
				event(map[x][y],direction);
				break;
			}
			if(map[x][y] ==0 && (x==(N-1)) && !(x==startx && y==starty)) {
				score++;
				moveup();
				break;
			}
			if(map[x][y] == -1 || (x==startx && y==starty)){
				max=Math.max(max, score);
				break;
			}
		}
	}
	
	// 왼쪽으로 이동
	static void moveleft() {
//		System.out.println("left실행");
		direction = "l";
		while(y>0) {
			y--;
			if(map[x][y] >=1 && map[x][y] <=10 && !(x==startx && y==starty)) {
				event(map[x][y],direction);
				break;
			}
			if(map[x][y] ==0 && (y==0) && !(x==startx && y==starty)) {
				score++;
				moveright();
				break;
			}
			if(map[x][y] == -1 || (x==startx && y==starty)){
				max=Math.max(max, score);
				break;
			}
		}
	}
	
	// 오른쪽으로 이동
	static void moveright() {
//		System.out.println("right실행");
		direction = "r";
		while(y<N-1) {
			y++;

			if(map[x][y] >=1 && map[x][y] <=10 && !(x==startx && y==starty)) {
				event(map[x][y],direction);
				break;
			}
			if(map[x][y] == 0 && (y== (N-1)) && !(x==startx && y==starty)) {
				score++;
				moveleft();
				break;
			}
			if(map[x][y] == -1 || (x==startx && y==starty)){
				max=Math.max(max, score);
				break;
			}
		}	
	}
}
