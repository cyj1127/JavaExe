package ch09.iskindof06;

public class PoliceMain {
	public static void main(String[] args) {
		ForcePolice fp = new ForcePolice(10,5);
		fp.run();			//달린다
		fp.fight();			//싸운다
		fp.shot();			//총을 쏴서 위협
		fp.puthandCuff();	//수갑을 채운다
		
		NursePolice np = new NursePolice(10,5,3);
		np.calcThermometer(); //온도를 측정
		np.puthandCuff();		//수갑을 채운다
		np.shot();
		np.shot();
		np.shot();
	}

}
