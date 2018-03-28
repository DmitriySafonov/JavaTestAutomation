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
						
				public String getPsuType() {
					return PsuType;
				}

				public void setPsuType(String psuType) {
					PsuType = psuType;
				}

				public float getPsuInputVoltage() {
					return PsuInputVoltage;
				}

				public void setPsuInputVoltage(float psuInputVoltage) {
					PsuInputVoltage = psuInputVoltage;
				}

				public float getPsuOutputVoltage() {
					return PsuOutputVoltage;
				}

				public void setPsuOutputVoltage(float psuOutputVoltage) {
					PsuOutputVoltage = psuOutputVoltage;
				};
					
	
				
}
