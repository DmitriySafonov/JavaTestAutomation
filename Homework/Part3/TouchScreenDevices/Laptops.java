public class Laptops extends TouchScreenDevices{
					private String CpuModel; //e.g. Intel i3-3120, FX-8120
					private String RamModel; 
					private String StorageDeviceModel;
			public void changeRam(String NewRamModel) {RamModel=NewRamModel;};
			public void changeStorage(String NewStorageDeviceModel) {StorageDeviceModel=NewStorageDeviceModel;};
			public String getCpuModel() {
				return CpuModel;
			}
			public void setCpuModel(String cpuModel) {
				CpuModel = cpuModel;
			}
			public String getRamModel() {
				return RamModel;
			}
			public String getStorageDeviceModel() {
				return StorageDeviceModel;
			};
			
}
