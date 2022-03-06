
public class ChainedExceptionEx {

	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException2 e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void install() throws InstallException2 {
		try {
			startInstall(); 	// 프로그램 설치에 필요한 준비를 한다.
			copyFiles(); 		// 파일들을 복사한다.
		} catch (SpaceException2 se) {
			InstallException2 ie = new InstallException2("설치 중 예외 발생");
			ie.initCause(se);
			throw ie;
		} catch (MemoryException2 me) {
			InstallException2 ie = new InstallException2("설치 중 예외 발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}
	}
	static void startInstall() throws SpaceException2, MemoryException2 {
		if (!enoughSpace())	// 충분한 설치 공간이 없으면
			throw new SpaceException2("설치할 공간이 부족합니다.");
		if (!enoughMemory()) {	// 충분한 메모리가 없으면..
			throw new MemoryException2("메모리가 부족합니다.");
//			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
	}
	static void copyFiles() {/* 파일들을 복사하는 코드를 적는다. */}
	static void deleteTempFiles() {/* 임시파일들을 삭제하는 코드를 적는다. */}
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
	}
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return true;
	}
}

class InstallException2 extends Exception {
	InstallException2(String msg) {
		super(msg);
	}
}

class SpaceException2 extends Exception {
	SpaceException2(String msg) {
		super(msg);
	}
}

class MemoryException2 extends Exception {
	MemoryException2(String msg) {
		super(msg);
	}
}
