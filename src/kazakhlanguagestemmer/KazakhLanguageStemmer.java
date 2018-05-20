/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kazakhlanguagestemmer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Bagdat
 */
public class KazakhLanguageStemmer extends Application {
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        String[] suffixes = {"атын", "етін",
        "йтын", "йтін", "дікі", "тікі", "нікі","дайын", "дейін", "тайын", "тейін","ғалы", "гелі", "қалы",
        "келі",  "шама", "шеме", "шалық", "шелік","ңыздар", "ңіздер","даған", "деген", "таған", 
        "теген", "лаған", "леген","дар", "дер","тар", "тер", "лар", "лер","мын", "мін", "бын", "бін",
        "пын", "пін", "мыз", "міз", "быз", "біз", "пыз", "піз", "сың", "сің", "сыз", "сіз", "сіздер", 
        "ңдар", "ңдер", "ңыз","ңіз",   "дан", "ден", "тан", "тен", "нан", "нен",  "нда", "нде",  "дың", 
        "дің", "тың", "тің", "ның", "нің", "бен", "пен", "мен",  "дай", "дей", "тай", "тей", "дық", "дік",
        "тық", "тік", "лық", "лік", "паз","ғыш", "гіш", "қыш", "кіш", "шек", "шақ", "шыл", "шіл", "нші", "ншы",
        "дап", "деп", "тап", "теп", "лап", "леп",  "даc", "деc", "таc", "теc", "лаc", "леc",  "ғар", "гер", "қар",
        "кер", "дыр", "дір", "тыр","тір", "ғыз", "гіз", "қыз", "кіз", "ған", "ген", "қан", "кен",  "ушы", "уші",
        "ып", "іп",  "ша", "ше","лай", "лей",  "сын", "сін", "са",
        "се", "бақ", "бек", "пақ", "пек", "мақ", "мек", "йын", "йін", "йық", "йік","лы", "лі","ал",
        "ғы", "гі", "қы", "кі", "ды", "ді", "ты", "ті", "ны", "ні", "ау", "еу", "ба", "бе", "па", "пе",
        "ма", "ме","ға", "ге", "қа", "ке", "на", "не","да",
        "де","та", "те","сы", "сі", "ла", "ле","р", "п","ар","ы","ер"};
        ImageView imgv = new ImageView();
//        Image r = new Image("C:\\Users\\Bagdat\\Desktop\\alemresearch\\flag.png");
        Image r = new Image(new FileInputStream("C:\\Users\\Bagdat\\Desktop\\alemresearch\\flag.png"));
        imgv.setImage(r);
        TextField soz = new TextField();
        TextField zhauap = new TextField();
        Text t1 = new Text("Жалпы сөз:");
        Text t2 = new Text("Сөз Түбірі:");
        soz.setFont(Font.font("Arial", FontWeight.MEDIUM, 15));
        zhauap.setFont(Font.font("Arial", FontWeight.MEDIUM, 15));
        zhauap.setStyle("-fx-text-inner-color: green;");
        t1.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
        t2.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
        soz.setPrefWidth(200);
        zhauap.setPrefWidth(200);
        t1.setTranslateX(95);
        t1.setTranslateY(138);
        t2.setTranslateX(100);
        t2.setTranslateY(178);
        Button btn = new Button();
        btn.setMinHeight(40);
        btn.setMinWidth(100);
        btn.setStyle("-fx-font: 20 arial; -fx-base: #b6e7c9;");
        btn.setTranslateX(170);
        btn.setTranslateY(220);
        soz.setTranslateX(210);
        soz.setTranslateY(120);
        zhauap.setTranslateX(210);
        zhauap.setTranslateY(160);
        btn.setText("Find Stem");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                String[] ss = soz.getText().split(" ");
                if(ss.length==1){
                    ArrayList<String> sozder = new ArrayList<>();
                    sozder.add(ss[0]);
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                    }
                        zhauap.setText(sozder.get(0));
                }
                if(ss.length==2){
                    ArrayList<String> sozder = new ArrayList<>();
                    ArrayList<String> sozder2 = new ArrayList<>();
                    sozder.add(ss[0]);
                    sozder2.add(ss[1]);
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                    }
                        zhauap.setText(sozder.get(0)+" "+sozder2.get(0));
                
                }
                if(ss.length==3){
                    ArrayList<String> sozder = new ArrayList<>();
                    ArrayList<String> sozder2 = new ArrayList<>();
                    ArrayList<String> sozder3 = new ArrayList<>();
                    sozder.add(ss[0]);
                    sozder2.add(ss[1]);
                    sozder3.add(ss[2]);
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }
                    }
                        zhauap.setText(sozder.get(0)+" "+sozder2.get(0)+" "+sozder3.get(0));
                
                }
            }
        });
        
        Group root = new Group();
        root.addEventHandler(KeyEvent.KEY_PRESSED, ev -> {
        if (ev.getCode() == KeyCode.ENTER) {
           String[] ss = soz.getText().split(" ");
                if(ss.length==1){
                    ArrayList<String> sozder = new ArrayList<>();
                    sozder.add(ss[0]);
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                    }
                        zhauap.setText(sozder.get(0));
                }
                if(ss.length==2){
                    ArrayList<String> sozder = new ArrayList<>();
                    ArrayList<String> sozder2 = new ArrayList<>();
                    sozder.add(ss[0]);
                    sozder2.add(ss[1]);
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                    }
                        zhauap.setText(sozder.get(0)+" "+sozder2.get(0));
                
                }
                if(ss.length==3){
                    ArrayList<String> sozder = new ArrayList<>();
                    ArrayList<String> sozder2 = new ArrayList<>();
                    ArrayList<String> sozder3 = new ArrayList<>();
                    sozder.add(ss[0]);
                    sozder2.add(ss[1]);
                    sozder3.add(ss[2]);
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }

                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }
                    }
                    for(String s:suffixes){
                        if(sozder.get(0).endsWith(s)&&sozder.get(0).length()>3){
                            int q = sozder.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder.get(0)).replace(q, q+s.length(),"").toString();
                            sozder.set(0, str);
                            break;
                        }
                        if(sozder2.get(0).endsWith(s)&&sozder2.get(0).length()>3){
                            int q = sozder2.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder2.get(0)).replace(q, q+s.length(),"").toString();
                            sozder2.set(0, str);
                            break;
                        }
                        if(sozder3.get(0).endsWith(s)&&sozder3.get(0).length()>3){
                            int q = sozder3.get(0).lastIndexOf(s);
                            String  str = new StringBuilder(sozder3.get(0)).replace(q, q+s.length(),"").toString();
                            sozder3.set(0, str);
                            break;
                        }
                    }
                        zhauap.setText(sozder.get(0)+" "+sozder2.get(0)+" "+sozder3.get(0));
                }
        }
            });
        root.getChildren().add(imgv);
        root.getChildren().add(btn);
        root.getChildren().add(soz);
        root.getChildren().add(zhauap);
        root.getChildren().add(t2);
        root.getChildren().add(t1);
        
        Scene scene = new Scene(root, 800, 500);
        
        primaryStage.setTitle("Stemmer For Kazakh Language");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
