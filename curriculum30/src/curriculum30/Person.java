package curriculum30;

public class Person {

	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;

	static int totalCount = 0;
	// 全体の人数をカウントするstatic変数

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		totalCount++; // インスタンスが作られるたびに増やす
	}

	public void print() {
		System.out.println();
		System.out.println("「名前は" + name + "です」");
		System.out.println("「年は" + age + "です」");
		double bmi = weight / (height * height); //bmi計算式
		System.out.printf("「BMIは %.1f です。」\n", bmi);
	}

	public static void printTotal() { //合計人数を出力
		System.out.println();
		System.out.println("合計" + totalCount + "人です");
	}
}