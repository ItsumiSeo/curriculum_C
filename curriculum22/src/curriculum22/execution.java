package curriculum22;

public class execution {
public static void main(String[] args) {
		
	//呼び出し
	process japan = new process("こんにちは！ここは日本です！","この寿司はうまい","寿司は和食です");
	
	//使用
	System.out.println(process.gr);
	System.out.println(process.sushi);
	System.out.println(process.wasyoku);
	System.out.println("今の現在日時は" + java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s")) + "です");
	}
}
