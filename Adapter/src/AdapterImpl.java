
public class AdapterImpl implements Adapter{

	// Math math;
	// 강화된 알고리즘으로 변경하기 원한다면 AdapterImple.java만 수정하면 된다
	@Override
	public Float twiceOf(Float f) {
		
		return (float)Math.twoTime(f.doubleValue());
		// return Math.doubled(f.doubleValue()).floatValue();
		// 위의 코드로 변경한다면 강화된 알고리즘 적용이 가능하다.
	}

	// 로그를 찍는 기능 구현
	@Override
	public Float halfOf(Float f) {
		System.out.println("절반 함수 호출 시작");
		return (float)Math.half(f.doubleValue());
	}

}
