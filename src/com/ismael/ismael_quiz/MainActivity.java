package com.ismael.ismael_quiz;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button btiniciar, btper1, btper2, btper3, btper4, btper5, btper6, btper7, btper8, btper9, btper10, btvoltar1, btsair;
	RadioGroup rgopcoes1;
	TextView textview1, textview2;
	ImageView imageview1;
	static int acertos;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciar();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void iniciar(){
    	acertos = 0;
    	 setContentView(R.layout.activity_main);
    	 btiniciar = (Button)findViewById(R.id.btiniciar);
    	 btsair = (Button)findViewById(R.id.btsair);
         btiniciar.setOnClickListener(new View.OnClickListener() {
 			
 			@Override
 			public void onClick(View arg0) {
 				// TODO Auto-generated method stub
 				pergunta1();
 			}
 		});
         
         btsair.setOnClickListener(new View.OnClickListener() {
  			
          	@Override
      		public void onClick(View arg0) {
      			// TODO Auto-generated method stub
          		 moveTaskToBack(true);
          		  android.os.Process.killProcess(android.os.Process.myPid());
          		  System.exit(1);
      	}
      	}); 
    }
    
    public void pergunta1(){
   	 setContentView(R.layout.pergunta1);
   	 btper1 = (Button)findViewById(R.id.btper1);
 	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
	rgopcoes1 = (RadioGroup)findViewById(R.id.radioGroup1);
        btper1.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    		
    		int op = rgopcoes1.getCheckedRadioButtonId();
    	int acertou = 0;
    		if(op == R.id.op1){
    			acertou = 1;
    		} else if(op == R.id.op2){
    			acertou = 0;
    		} else if(op == R.id.op3){
    			acertou = 0;
    		}else if(op == R.id.op4){
    			acertou = 0;
    		}
    		
    		
    		if(acertou==1){
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Acertou!");
    				dialogo.setMessage("Resposta correta!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    				acertos = acertos + 1;
    				pergunta2();
    				
    	}else{
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Errou!");
    				dialogo.setMessage("Errou. A resposta correta é Chell!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    				pergunta2();
    		}
    	}
    	});
 btvoltar1.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    		iniciar();
    	}
    	});
        
    }
    
    public void pergunta2(){
      	 setContentView(R.layout.pergunta2);
      	 btper2 = (Button)findViewById(R.id.btper2);
    	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
   	rgopcoes1 = (RadioGroup)findViewById(R.id.radioGroup1);
           btper2.setOnClickListener(new View.OnClickListener() {
   			
           	@Override
       		public void onClick(View arg0) {
       			// TODO Auto-generated method stub
           		int acertou = 0;
       		int op = rgopcoes1.getCheckedRadioButtonId();
       		
       		if(op == R.id.op1){
       			acertou = 0;
       		} else if(op == R.id.op2){
       			acertou = 0;
       		} else if(op == R.id.op3){
       			acertou = 1;
       		}else if(op == R.id.op4){
       			acertou = 0;
       		}
       		
       		
       		if(acertou==1){
       		AlertDialog.Builder dialogo = new
       				AlertDialog.Builder(MainActivity.this);
       				dialogo.setTitle("Acertou!");
       				dialogo.setMessage("Resposta correta!");
       				dialogo.setNeutralButton("OK", null);
       				dialogo.show();
       				acertos = acertos + 1;
       				pergunta3();
       				
       	}else{
       		AlertDialog.Builder dialogo = new
       				AlertDialog.Builder(MainActivity.this);
       				dialogo.setTitle("Errou!");
       				dialogo.setMessage("Errou. A resposta correta é GLaDOS!");
       				dialogo.setNeutralButton("OK", null);
       				dialogo.show();
       				pergunta3();
       		}
       	}
       	});
           btvoltar1.setOnClickListener(new View.OnClickListener() {
   			
           	@Override
       		public void onClick(View arg0) {
       			// TODO Auto-generated method stub
       		iniciar();
       	}
       	});
           
       }
    
    public void pergunta3(){
     	 setContentView(R.layout.pergunta3);
     	 btper3 = (Button)findViewById(R.id.btper3);
   	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
  	rgopcoes1 = (RadioGroup)findViewById(R.id.radioGroup1);
          btper3.setOnClickListener(new View.OnClickListener() {
  			
          	@Override
      		public void onClick(View arg0) {
      			// TODO Auto-generated method stub
          		int acertou = 0;
      		int op = rgopcoes1.getCheckedRadioButtonId();
      		
      		if(op == R.id.op1){
      			acertou = 0;
      		} else if(op == R.id.op2){
      			acertou = 0;
      		} else if(op == R.id.op3){
      			acertou = 1;
      		}else if(op == R.id.op4){
      			acertou = 0;
      		}
      		
      		
      		if(acertou==1){
      		AlertDialog.Builder dialogo = new
      				AlertDialog.Builder(MainActivity.this);
      				dialogo.setTitle("Acertou!");
      				dialogo.setMessage("Resposta correta!");
      				dialogo.setNeutralButton("OK", null);
      				dialogo.show();
      				acertos = acertos + 1;
      				pergunta4();
      				
      	}else{
      		AlertDialog.Builder dialogo = new
      				AlertDialog.Builder(MainActivity.this);
      				dialogo.setTitle("Errou!");
      				dialogo.setMessage("Errou. A resposta correta é Still Alive!");
      				dialogo.setNeutralButton("OK", null);
      				dialogo.show();
      				pergunta4();
      		}
      	}
      	});
          btvoltar1.setOnClickListener(new View.OnClickListener() {
  			
          	@Override
      		public void onClick(View arg0) {
      			// TODO Auto-generated method stub
      		iniciar();
      	}
      	});
          
      }
    
    public void pergunta4(){
    	 setContentView(R.layout.pergunta4);
    	 btper4 = (Button)findViewById(R.id.btper4);
  	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
 	rgopcoes1 = (RadioGroup)findViewById(R.id.radioGroup1);
         btper4.setOnClickListener(new View.OnClickListener() {
 			
         	@Override
     		public void onClick(View arg0) {
     			// TODO Auto-generated method stub
         		int acertou = 0;
     		int op = rgopcoes1.getCheckedRadioButtonId();
     		
     		if(op == R.id.op1){
     			acertou = 0;
     		} else if(op == R.id.op2){
     			acertou = 0;
     		} else if(op == R.id.op3){
     			acertou = 0;
     		}else if(op == R.id.op4){
     			acertou = 1;
     		}
     		
     		
     		if(acertou==1){
     		AlertDialog.Builder dialogo = new
     				AlertDialog.Builder(MainActivity.this);
     				dialogo.setTitle("Acertou!");
     				dialogo.setMessage("Resposta correta!");
     				dialogo.setNeutralButton("OK", null);
     				dialogo.show();
     				acertos = acertos + 1;
     				pergunta5();
     				
     	}else{
     		AlertDialog.Builder dialogo = new
     				AlertDialog.Builder(MainActivity.this);
     				dialogo.setTitle("Errou!");
     				dialogo.setMessage("Errou. A resposta correta é Companion Cube!");
     				dialogo.setNeutralButton("OK", null);
     				dialogo.show();
     				pergunta5();
     		}
     	}
     	});
         btvoltar1.setOnClickListener(new View.OnClickListener() {
 			
         	@Override
     		public void onClick(View arg0) {
     			// TODO Auto-generated method stub
     		iniciar();
     	}
     	});
         
     }
    
    public void pergunta5(){
   	 setContentView(R.layout.pergunta5);
   	 btper5 = (Button)findViewById(R.id.btper5);
 	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
	rgopcoes1 = (RadioGroup)findViewById(R.id.radioGroup1);
        btper5.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
        		
    		int op = rgopcoes1.getCheckedRadioButtonId();
    		int acertou = 0;
    		if(op == R.id.op1){
    			acertou = 0;
    		} else if(op == R.id.op2){
    			acertou = 0;
    		} else if(op == R.id.op3){
    			acertou = 0;
    		}else if(op == R.id.op4){
    			acertou = 1;
    		}
    		
    		
    		if(acertou==1){
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Acertou!");
    				dialogo.setMessage("Resposta correta!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    				acertos = acertos + 1;
    				pergunta6();
    				
    	}else{
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Errou!");
    				dialogo.setMessage("Errou. A resposta correta é Turrets!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    				pergunta6();
    		}
    	}
    	});
 btvoltar1.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    		iniciar();
    	}
    	});
        
    }
    
    public void pergunta6(){
   	 setContentView(R.layout.pergunta6);
   	 btper6 = (Button)findViewById(R.id.btper6);
 	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
	rgopcoes1 = (RadioGroup)findViewById(R.id.radioGroup1);
        btper6.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
        		int acertou = 0;
    		int op = rgopcoes1.getCheckedRadioButtonId();
    	
    		if(op == R.id.op1){
    			acertou = 0;
    		} else if(op == R.id.op2){
    			acertou = 1;
    		} else if(op == R.id.op3){
    			acertou = 0;
    		}else if(op == R.id.op4){
    			acertou = 0;
    		}
    		
    		
    		if(acertou==1){
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Acertou!");
    				dialogo.setMessage("Resposta correta!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    			acertos = acertos + 1;
    				pergunta7();
    				
    	}else{
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Errou!");
    				dialogo.setMessage("Errou. A resposta correta é Aperture Science!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    				pergunta7();
    		}
    	}
    	});
 btvoltar1.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    		iniciar();
    	}
    	});
        
    }
    
    public void pergunta7(){
   	 setContentView(R.layout.pergunta7);
   	 btper7 = (Button)findViewById(R.id.btper7);
 	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
	rgopcoes1 = (RadioGroup)findViewById(R.id.radioGroup1);
        btper7.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
        		int acertou = 0;
    		int op = rgopcoes1.getCheckedRadioButtonId();
    		
    		if(op == R.id.op1){
    			acertou = 1;
    		} else if(op == R.id.op2){
    			acertou = 0;
    		} else if(op == R.id.op3){
    			acertou = 0;
    		}else if(op == R.id.op4){
    			acertou = 0;
    		}
    		
    		
    		if(acertou==1){
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Acertou!");
    				dialogo.setMessage("Resposta correta!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    			acertos = acertos + 1;
    				pergunta8();
    				
    	}else{
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Errou!");
    				dialogo.setMessage("Errou. A resposta correta é Cave Johnson!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    				pergunta8();
    		}
    	}
    	});
 btvoltar1.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    		iniciar();
    	}
    	});
        
    }
    
    public void pergunta8(){
   	 setContentView(R.layout.pergunta8);
   	 btper8 = (Button)findViewById(R.id.btper8);
 	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
	rgopcoes1 = (RadioGroup)findViewById(R.id.radioGroup1);
        btper8.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
        		int acertou = 0;
    		int op = rgopcoes1.getCheckedRadioButtonId();
    	
    		if(op == R.id.op1){
    			acertou = 0;
    		} else if(op == R.id.op2){
    			acertou = 0;
    		} else if(op == R.id.op3){
    			acertou = 0;
    		}else if(op == R.id.op4){
    			acertou = 1;
    		}
    		
    		
    		if(acertou==1){
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Acertou!");
    				dialogo.setMessage("Resposta correta!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    				acertos = acertos + 1;
    				pergunta9();
    				
    	}else{
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Errou!");
    				dialogo.setMessage("Errou. A resposta correta é The Cake Is A Lie!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    				pergunta9();
    		}
    	}
    	});
 btvoltar1.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    		iniciar();
    	}
    	});
        
    }
    
    
    public void pergunta9(){
   	 setContentView(R.layout.pergunta9);
   	 btper9 = (Button)findViewById(R.id.btper9);
 	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
	rgopcoes1 = (RadioGroup)findViewById(R.id.radioGroup1);
        btper9.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
        		int acertou = 0;
    		int op = rgopcoes1.getCheckedRadioButtonId();
    		
    		if(op == R.id.op1){
    			acertou = 1;
    		} else if(op == R.id.op2){
    			acertou = 0;
    		} else if(op == R.id.op3){
    			acertou = 0;
    		}else if(op == R.id.op4){
    			acertou = 0;
    		}
    		
    		
    		if(acertou==1){
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Acertou!");
    				dialogo.setMessage("Resposta correta!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    			acertos = acertos + 1;
    				pergunta10();
    				
    	}else{
    		AlertDialog.Builder dialogo = new
    				AlertDialog.Builder(MainActivity.this);
    				dialogo.setTitle("Errou!");
    				dialogo.setMessage("Errou. A resposta correta é Handheld Portal Device!");
    				dialogo.setNeutralButton("OK", null);
    				dialogo.show();
    				pergunta10();
    		}
    	}
        });
        
 btvoltar1.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    		iniciar();
    	}
    	});
    }
        	
        	 public void pergunta10(){
            	 setContentView(R.layout.pergunta10);
            	 btper10 = (Button)findViewById(R.id.btper10);
          	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
         	rgopcoes1 = (RadioGroup)findViewById(R.id.radioGroup1);
                 btper10.setOnClickListener(new View.OnClickListener() {
         			
                 	@Override
             		public void onClick(View arg0) {
             			// TODO Auto-generated method stub
                 		int acertou = 0;
             		int op = rgopcoes1.getCheckedRadioButtonId();
             		
             		if(op == R.id.op1){
             			acertou = 0;
             		} else if(op == R.id.op2){
             			acertou = 0;
             		} else if(op == R.id.op3){
             			acertou = 1;
             		}else if(op == R.id.op4){
             			acertou = 0;
             		}
             		
             		
             		if(acertou==1){
             		AlertDialog.Builder dialogo = new
             				AlertDialog.Builder(MainActivity.this);
             				dialogo.setTitle("Acertou!");
             				dialogo.setMessage("Resposta correta!");
             				dialogo.setNeutralButton("OK", null);
             				dialogo.show();
             			acertos = acertos + 1;
             				resultado();
             				
             	}else{
             		AlertDialog.Builder dialogo = new
             				AlertDialog.Builder(MainActivity.this);
             				dialogo.setTitle("Errou!");
             				dialogo.setMessage("Errou. A resposta correta é 19!");
             				dialogo.setNeutralButton("OK", null);
             				dialogo.show();
             				resultado();
             		}
             	}
             	});
                 
                 btvoltar1.setOnClickListener(new View.OnClickListener() {
         			
                 	@Override
             		public void onClick(View arg0) {
             			// TODO Auto-generated method stub
             		iniciar();
             	}
             	});
                 
             }
    
    public void resultado(){
   	 setContentView(R.layout.resultado);
   	 textview1 = (TextView)findViewById(R.id.textView1);
   	textview2 = (TextView)findViewById(R.id.textView2);
   	 imageview1 = (ImageView)findViewById(R.id.imageView1);
 	btvoltar1 = (Button)findViewById(R.id.btvoltar1);
 	
 	int erros = 10 - acertos;
 	
 	textview1.setText("Acertou " + acertos + " e errou " + erros + "!");
 	
 	if (acertos == 10) {
 		 textview2.setText("Você é incrível!");
 		imageview1.setImageResource(R.drawable.companion);
 	}else if (acertos >= 8) {
		 textview2.setText("Você conhece Portal muito bem!");
		 imageview1.setImageResource(R.drawable.atlas);
	}else if (acertos >= 6) {
		 textview2.setText("Você sabe bastante do jogo!");
		 imageview1.setImageResource(R.drawable.pbody);
	}else if (acertos >= 4) {
		 textview2.setText("Você tem um pouco de conhecimento de Portal!");
		 imageview1.setImageResource(R.drawable.wheatley);
	}else if (acertos >= 2) {
		 textview2.setText("Você não sabe muito sobre Portal...");
		 imageview1.setImageResource(R.drawable.turret);
	}else {
		 textview2.setText("Você devia jogar mais Portal!");
		 imageview1.setImageResource(R.drawable.glados);
	}
 		
 	
        
        btvoltar1.setOnClickListener(new View.OnClickListener() {
			
        	@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    		iniciar();
    	}
    	});
        
    }
	 


}
    
    
    

