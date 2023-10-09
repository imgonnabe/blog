package runtimeDynamicLoading;

public class RuntimeLoading {
	public static void main(String[] args) {
		try {
			if (args.length < 1) {
				System.out.println("사용법: java RuntimeLoading [클래스 이름]");
				System.exit(1);
			}
			Class<?> klass = Class.forName("Hello");
			Object obj = klass.newInstance();
			Runnable r = (Runnable) obj;
			r.run();
		} catch (Exception e) {
		}
	}

}
