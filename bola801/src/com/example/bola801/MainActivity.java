package com.example.bola801;

import java.util.Random;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity 
{

	//declaramos el textView y el imageView creados en el activity_main
	TextView texto1;
	ImageView imagen1;
	Random aleatorio;
	
	
	
	
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		    			super.onCreate(savedInstanceState);
		    			setContentView(R.layout.activity_main);
				
		texto1  = (TextView) findViewById(R.id.textView1);
		imagen1 = (ImageView)findViewById(R.id.imageView1);
		
		Resources res = getResources();
    	String [] salida = res.getStringArray(R.array.respuestas);
    	int i=0;
    	do
    	{
    		i=aleatorio.nextInt();
    	}while(i>salida.length);
    	
		imagen1.setOnClickListener(new View.OnClickListener() 
		{
			@Override
			public void onClick(View v) 
			{
				// TODO Auto-generated method stub
		//		String texto = "Ahora la respuesta es no";	
		//		texto1.setText(texto);

				
			texto1.setText(salida[i]);
			}
		});
    }

    	
					    @Override
					    public boolean onCreateOptionsMenu(Menu menu) 
					    {
					        		getMenuInflater().inflate(R.menu.main, menu);
					        		return true;
					    }
					
					    @Override
					    public boolean onOptionsItemSelected(MenuItem item) 
					    {
							        // Handle action bar item clicks here. The action bar will
							        // automatically handle clicks on the Home/Up button, so long
							        // as you specify a parent activity in AndroidManifest.xml.
							        int id = item.getItemId();
							        if (id == R.id.action_settings) {
							            return true;
							        }
							        return super.onOptionsItemSelected(item);
					    }
}
