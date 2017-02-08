package liquiddark.com.tasklist;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by mhr on 03-Feb-17.
 */

public class DialogAdd extends DialogFragment{

    private ImageButton mCloseButton;
    private EditText mInputWhatET;
    private DatePicker mInputDP;
    private Button mAddButton;

    public DialogAdd(){

    }


    private View.OnClickListener mButtonClickListner = new View.OnClickListener(){
        @Override
        public void onClick(View v) {

            switch (v.getId()){
                case R.id.btn_add_drop:

                    addAction();

                    break;
                case R.id.btn_close:
                    break;
            }
            dismiss();

        }

    };


    private void addAction() {
        String actionText =  mInputWhatET.getText().toString();
        long now = System.currentTimeMillis();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog_add,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mCloseButton = (ImageButton) view.findViewById(R.id.btn_close);
        mInputWhatET = (EditText) view.findViewById(R.id.editT_add_drop);
        mInputDP = (DatePicker) view.findViewById(R.id.dpicker_date);
        mAddButton = (Button) view.findViewById(R.id.btn_add_drop);



        mCloseButton.setOnClickListener(mButtonClickListner);
        mAddButton.setOnClickListener(mButtonClickListner);

    }
}
