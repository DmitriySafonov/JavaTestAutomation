import java.util.*;
import javax.swing.JOptionPane;


public class Tablets extends TouchScreenDevices{
					private boolean IsExternalKeyboardSuppurted;
					private boolean IsExternalKeyboardPluged;
					private String ExternalKeyboardConnectorType;
					
			public void plugInExternatlKeyboard() {
				if (IsExternalKeyboardSuppurted==true & IsExternalKeyboardPluged==false) {
					IsExternalKeyboardPluged=true;
				} else {
					JOptionPane.showMessageDialog(null,"Device doesn't support an external keyboard.");
				}
			};
			public void unplugExternatlKeyboard() {IsExternalKeyboardPluged=false;};
			public void unplugExternatlKeyboard() {IsExternalKeyboardPluged=false;}
			public boolean isExternalKeyboardSuppurted() {
				return IsExternalKeyboardSuppurted;
			}
			public void setIsExternalKeyboardSuppurted(boolean isExternalKeyboardSuppurted) {
				IsExternalKeyboardSuppurted = isExternalKeyboardSuppurted;
			}
			public String getExternalKeyboardConnectorType() {
				return ExternalKeyboardConnectorType;
			}
			public void setExternalKeyboardConnectorType(String externalKeyboardConnectorType) {
				ExternalKeyboardConnectorType = externalKeyboardConnectorType;
			};
}
