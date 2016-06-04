package clientinfo.app.clientinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class AddressActivity extends AppCompatActivity {

    TextView address, mobile, phone, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        address = (TextView)findViewById(R.id.id_text_address);
        phone = (TextView)findViewById(R.id.id_phone);
        mobile = (TextView)findViewById(R.id.id_mobile);
        email = (TextView)findViewById(R.id.id_email);

        address.setText(Constants.ADDRESS_LINE);
        phone.setText(Constants.PHONE);
        mobile.setText(Constants.MOBILE);
        email.setText(Constants.EMAIL);

        address.setTextIsSelectable(true);
        phone.setTextIsSelectable(true);
        mobile.setTextIsSelectable(true);
        email.setTextIsSelectable(true);

        Linkify.addLinks(mobile, Linkify.WEB_URLS | Linkify.PHONE_NUMBERS);
        Linkify.addLinks(phone, Linkify.WEB_URLS | Linkify.PHONE_NUMBERS);
        Linkify.addLinks(email, Linkify.WEB_URLS | Linkify.PHONE_NUMBERS | Linkify.EMAIL_ADDRESSES);

    }
}
