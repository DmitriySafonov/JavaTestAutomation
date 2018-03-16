public class ElectronicInstruments extends MusicInstruments {
						private String PsuType; //e.g. battery, external PSU, built-in PSU
						private float PsuInputVoltage;
						private float PsuOutputVoltage;
				
				private void  missingOperationPSU() {PsuOutputVoltage=0;};
						
				public void changePSU(String NewPsuType, float NewPsuInputVoltage, float NewPsuOutputVoltage) {
					PsuType=NewPsuType;
					PsuInputVoltage=NewPsuInputVoltage;
					PsuOutputVoltage=NewPsuOutputVoltage;
				};
						
					
				
}
