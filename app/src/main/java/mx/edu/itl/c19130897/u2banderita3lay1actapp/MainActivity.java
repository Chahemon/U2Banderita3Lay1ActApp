package mx.edu.itl.c19130897.u2banderita3lay1actapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verde_layout);
    }

    //--------------------------------------------------------------------------------------------------
    // FORMA 1 : Definir un metodo distinto en la propiedad onClick
    //           para cada boton.

    public void btnAcercaDeClick ( View v ) {
        Toast.makeText (
                this,
                "Héctor Manuel Chávez De la Vega\n" +
                        "(19130897)",
                Toast.LENGTH_LONG
        ).show ();
    }

    public void btnSalirClick ( View v ) {
        finish ();
    }

    public void btnVerdeSiguienteClick ( View v ) {
        setContentView ( R.layout.blanco_layout );
    }

    public void btnBlancoAtrasClick ( View v ) {
        setContentView ( R.layout.verde_layout );
    }

    public void btnBlancoSiguienteClick ( View v ) {
        setContentView ( R.layout.rojo_layout );
    }

    public void btnRojoAtrasClick ( View v ) {
        setContentView ( R.layout.blanco_layout );
    }
    //-------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------

    //FORMA 2: Un unico metodo a invocar por los botones

    public void btnGenericoClick ( View v ) {
        switch ( v.getId () ) {
            case R.id.btnAcercaDe        : btnAcercaDeClick( v );
                                           break;
            case R.id.btnSalir           : finish();
                                           break;
            case R.id.btnBlancoAtras     : setContentView( R.layout.verde_layout );
                                           break;
            case R.id.btnBlancoSiguiente : setContentView( R.layout.rojo_layout );
                                           break;
            case R.id.btnRojoAtras       : setContentView( R.layout.blanco_layout );
                                           break;
            case R.id.btnVerdeSiguiente  : setContentView( R.layout.blanco_layout );
                                           break;
        }
    }

}