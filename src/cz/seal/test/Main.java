
package cz.seal.test;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

public class Main extends Activity {

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showDialog(0);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        return new DatePickerDialog(this, null, 2012, 5, 1);
    }

}
