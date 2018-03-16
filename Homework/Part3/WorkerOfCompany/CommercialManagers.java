package myPackage01;

public class CommercialManagers extends WorkerOfCompany{
					private float SalesObjectiveAmounPerMonthtUSD;
					private float CurrentsSalesAmountUSD;
					private String RegionsUnderManage;
					
			public void setSalesObjectiveAnmountUSD(float NewAmount) {SalesObjectiveAmounPerMonthtUSD=NewAmount;};
			public float checkSalesObjectiveComplitionPercent() {
				return Math.round(CurrentsSalesAmountUSD/SalesObjectiveAmounPerMonthtUSD*100);
			}
			
			
}
