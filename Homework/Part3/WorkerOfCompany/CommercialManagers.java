public class CommercialManagers extends WorkerOfCompany{
					private float SalesObjectiveAmounPerMonthtUSD;
					private float CurrentsSalesAmountUSD;
					private String RegionsUnderManage;
					
			public void setSalesObjectiveAnmountUSD(float NewAmount) {SalesObjectiveAmounPerMonthtUSD=NewAmount;};
			public float checkSalesObjectiveComplitionPercent() {
				return Math.round(CurrentsSalesAmountUSD/SalesObjectiveAmounPerMonthtUSD*100);
			}
			public float getCurrentsSalesAmountUSD() {
				return CurrentsSalesAmountUSD;
			}
			public void setCurrentsSalesAmountUSD(float currentsSalesAmountUSD) {
				CurrentsSalesAmountUSD = currentsSalesAmountUSD;
			}
			public String getRegionsUnderManage() {
				return RegionsUnderManage;
			}
			public void setRegionsUnderManage(String regionsUnderManage) {
				RegionsUnderManage = regionsUnderManage;
			}
			public float getSalesObjectiveAmounPerMonthtUSD() {
				return SalesObjectiveAmounPerMonthtUSD;
			}

			
			
}
