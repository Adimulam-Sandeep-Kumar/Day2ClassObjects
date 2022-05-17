
public class CreateChocolate {

	public static void main(String[] args) {

		Chocolate cadburyDairyMilk=new Chocolate("Dark Milk",156.00,199,"Paperbox",false);
		Chocolate fiveStar=new Chocolate("5Star New Soft Bar",25.00,10,"Silverfoil",false);
		Chocolate KitKat= new Chocolate("Cocoa Butter",37.00,20,"papersleeve",false);
		Chocolate Snickers=new Chocolate("PeanutFilled Chocolate",100.00,50,"Silverfoil",false);
		Chocolate Mars=new Chocolate("Fruity Confections",51.00,45,"Wrapper",false);
		Chocolate Bounty=new Chocolate("Coconut Filled",28.00,55,"Silverfoil",false);
		Chocolate Bournville=new Chocolate("Cocoa Dark Chocolate",31.00,45,"Silverfoil",false);
		Chocolate MilkyBar=new Chocolate("Smooth white chocolate",40.00,10,"Silverfoil",false);
		Chocolate AmulDarkChocolate=new Chocolate("Cocoa Chocolate",40.00,25,"Paperbox",false);
		Chocolate Temptations=new Chocolate("Almond Flavour",72.00,120,"Silverfoil",false);
		
		System.out.println(cadburyDairyMilk);
		System.out.println(fiveStar);
		System.out.println(KitKat);
		System.out.println(Snickers);
		System.out.println(Mars);
		System.out.println(Bounty);
		System.out.println(Bournville);
		System.out.println(MilkyBar);
		System.out.println(AmulDarkChocolate);
		System.out.println(Temptations);

		boolean result=cadburyDairyMilk==fiveStar;
		System.out.println(result);

		boolean result1=cadburyDairyMilk==Snickers;
		System.out.println(result1);

		boolean result2=cadburyDairyMilk==KitKat;
		System.out.println(result2);

		boolean result3=cadburyDairyMilk==Mars;
		System.out.println(result3);

		boolean result4=cadburyDairyMilk==Bounty;
		System.out.println(result4);

		boolean result5=cadburyDairyMilk==Bournville;
		System.out.println(result5);

		boolean result6=cadburyDairyMilk==MilkyBar;
		System.out.println(result6);

		boolean result7=cadburyDairyMilk==AmulDarkChocolate;
		System.out.println(result7);

		boolean result8=cadburyDairyMilk==Temptations;
		System.out.println(result8);
		
		System.out.println(cadburyDairyMilk.hashCode());
		System.out.println(fiveStar.hashCode());
		System.out.println(KitKat.hashCode());
		System.out.println(Snickers.hashCode());
		System.out.println(Mars.hashCode());
		System.out.println(Bounty.hashCode());
		System.out.println(Bournville.hashCode());
		System.out.println(MilkyBar.hashCode());
		System.out.println(AmulDarkChocolate.hashCode());
		System.out.println(Temptations.hashCode());

		
		if(cadburyDairyMilk instanceof Chocolate && fiveStar instanceof Chocolate){

		result=cadburyDairyMilk==Snickers;
		System.out.println(result);

		}

		if(cadburyDairyMilk instanceof Chocolate && KitKat instanceof Chocolate){

		result=cadburyDairyMilk==fiveStar;
		System.out.println(result);

		}


		if(cadburyDairyMilk instanceof Chocolate && Snickers instanceof Chocolate){

		result=cadburyDairyMilk==KitKat;
		System.out.println(result);

		}
		
		if(cadburyDairyMilk instanceof Chocolate && Mars instanceof Chocolate){

		result=cadburyDairyMilk==Bounty;
		System.out.println(result);

		}

		if(cadburyDairyMilk instanceof Chocolate && Bounty instanceof Chocolate){

		result=cadburyDairyMilk==Bournville;
		System.out.println(result);

		}

		if(cadburyDairyMilk instanceof Chocolate && Bournville instanceof Chocolate){

		result=cadburyDairyMilk==MilkyBar;
		System.out.println(result);

		}


		if(cadburyDairyMilk instanceof Chocolate && MilkyBar instanceof Chocolate){

		result=cadburyDairyMilk==Snickers;
		System.out.println(result);

		}

		if(cadburyDairyMilk instanceof Chocolate && AmulDarkChocolate instanceof Chocolate){

		result=cadburyDairyMilk==Temptations;
		System.out.println(result);

		}


		if(cadburyDairyMilk instanceof Chocolate && Temptations instanceof Chocolate){

		result=cadburyDairyMilk==Snickers;
		System.out.println(result);

		}


		if(MilkyBar instanceof Chocolate && Bournville instanceof Chocolate){

		result=cadburyDairyMilk==Bounty;
		System.out.println(result);

		}		


		Chocolate chock=cadburyDairyMilk; // the reference of cadburyDairyMilk is assigned to chock
		System.out.println("#check"+cadburyDairyMilk.hashCode());
		System.out.println("#check"+chock.hashCode());

		Chocolate chock1=fiveStar;
		System.out.println("#check"+fiveStar.hashCode());
		System.out.println("#check"+chock1.hashCode());

		Chocolate chock2=KitKat;
		System.out.println("#check"+KitKat.hashCode());
		System.out.println("#check"+chock2.hashCode());

		Chocolate chock3=Snickers;
		System.out.println("#check"+Snickers.hashCode());
		System.out.println("#check"+chock3.hashCode());

		Chocolate chock4=Mars;
		System.out.println("#check"+Mars.hashCode());
		System.out.println("#check"+chock4.hashCode());

		Chocolate chock5=Bounty;
		System.out.println("#check"+Bounty.hashCode());
		System.out.println("#check"+chock5.hashCode());

		Chocolate chock6=Bournville;
		System.out.println("#check"+Bournville.hashCode());
		System.out.println("#check"+chock6.hashCode());

		Chocolate chock7=MilkyBar;
		System.out.println("#check"+MilkyBar.hashCode());
		System.out.println("#check"+chock7.hashCode());

		Chocolate chock8=AmulDarkChocolate;
		System.out.println("#check"+AmulDarkChocolate.hashCode());
		System.out.println("#check"+chock8.hashCode());

		Chocolate chock9=Temptations;
		System.out.println("#check"+Temptations.hashCode());
		System.out.println("#check"+chock9.hashCode());

		//arrays

		Chocolate chocolates[]=new Chocolate[10];
		chocolates[0]=cadburyDairyMilk;
		chocolates[1]=fiveStar;
		chocolates[2]=KitKat;
		chocolates[3]=Snickers;
		chocolates[4]=Mars;
		chocolates[5]=Bounty;
		chocolates[6]=Bournville;
		chocolates[7]=MilkyBar;
		chocolates[8]=AmulDarkChocolate;
		chocolates[9]=Temptations;


		for(int i=0;i<chocolates.length;i++){
			System.out.println("Chocolate @" +i+ " = "+chocolates[i]);

		}

	}

}
