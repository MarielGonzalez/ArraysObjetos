import java.util.function.BinaryOperator;

public class Bit {
		private short bin;
	
	public void setBit(boolean b) {
			if(b){
				bin=1;
			} else{
				bin=0;
			}
		
	}

	public short getBit() {
		return bin;
	}

		
}