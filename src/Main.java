
import javafx.scene.control.ToggleGroup;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.io.FileInputStream;

public class Main extends Application {
    Image twoDsnoopy;
    Image twoDcharlie;
    Image twoDwoodstock;
    Image twoDlinus;
    Image twoDsally;
    Image threeDsnoopy;
    Image threeDcharlie;
    Image threeDwoodstock;
    Image threeDlinus;
    Image threeDsally;

    float height;
    float width;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("HBox Experiment 1");

        FileInputStream input1 = new FileInputStream("src/Snoopy_Peanuts.png");
        twoDsnoopy = new Image(input1);
        FileInputStream input2 = new FileInputStream("src/Charlie_Brown.png");
        twoDcharlie = new Image(input2);
        FileInputStream input3 = new FileInputStream("src/Woodstock.png");
        twoDwoodstock = new Image(input3);
        FileInputStream input4 = new FileInputStream("src/Linus.png");
        twoDlinus = new Image(input4);
        FileInputStream input5 = new FileInputStream("src/Sally.png");
        twoDsally = new Image(input5);
        FileInputStream input6 = new FileInputStream("src/Snoopy3D.png");
        threeDsnoopy = new Image(input6);
        FileInputStream input7 = new FileInputStream("src/3DCharlie.png");
        threeDcharlie = new Image(input7);
        FileInputStream input8 = new FileInputStream("src/Woodstock3D.png");
        threeDwoodstock = new Image(input8);
        FileInputStream input9 = new FileInputStream("src/Linus3D.png");
        threeDlinus = new Image(input9);
        FileInputStream input10 = new FileInputStream("src/3DSally Small.png");
        threeDsally = new Image(input10);
        


        RadioButton twoDsnoopyButton = new RadioButton("Snoopy");
        RadioButton twoDcharlieButton = new RadioButton("Charlie");
        RadioButton twoDwoodstockButton = new RadioButton("Woodstock");
        RadioButton twoDlinusButton = new RadioButton("Linus");
        RadioButton twoDsallyButton = new RadioButton("Sally");

        RadioButton threeDsnoopyButton = new RadioButton("Snoopy");
        RadioButton threeDcharlieButton = new RadioButton("Charlie");
        RadioButton threeDwoodstockButton = new RadioButton("Woodstock");
        RadioButton threeDlinusButton = new RadioButton("Linus");
        RadioButton threeDsallyButton = new RadioButton("Sally");

        Button bigger = new Button("Make the picture bigger");
        Button smaller = new Button("Make the picture smaller");

        ToggleGroup twoDRadioGroup = new ToggleGroup();
        twoDsnoopyButton.setToggleGroup(twoDRadioGroup);
        twoDcharlieButton.setToggleGroup(twoDRadioGroup);
        twoDwoodstockButton.setToggleGroup(twoDRadioGroup);
        twoDlinusButton.setToggleGroup(twoDRadioGroup);
        twoDsallyButton.setToggleGroup(twoDRadioGroup);
        threeDsnoopyButton.setToggleGroup(twoDRadioGroup);
        threeDcharlieButton.setToggleGroup(twoDRadioGroup);
        threeDwoodstockButton.setToggleGroup(twoDRadioGroup);
        threeDlinusButton.setToggleGroup(twoDRadioGroup);
        threeDsallyButton.setToggleGroup(twoDRadioGroup);

        twoDsnoopyButton.setDisable(true);
        twoDcharlieButton.setDisable(true);
        twoDwoodstockButton.setDisable(true);
        twoDlinusButton.setDisable(true);
        twoDsallyButton.setDisable(true);
        threeDsnoopyButton.setDisable(true);
        threeDcharlieButton.setDisable(true);
        threeDwoodstockButton.setDisable(true);
        threeDlinusButton.setDisable(true);
        threeDsallyButton.setDisable(true);
        
        MenuItem TwoD = new MenuItem("2D");
        MenuItem ThreeD = new MenuItem("3D");
        MenuButton menuButton = new MenuButton("Dimension", null, TwoD, ThreeD);

        ImageView imageView1 = new ImageView();

        height = 400;

        imageView1.setFitHeight(height);
        imageView1.setFitWidth(height);

        twoDsnoopyButton.setOnAction(actionEvent -> imageView1.setImage(twoDsnoopy));
        twoDcharlieButton.setOnAction(actionEvent -> imageView1.setImage(twoDcharlie));
        twoDwoodstockButton.setOnAction(actionEvent -> imageView1.setImage(twoDwoodstock));
        twoDlinusButton.setOnAction(actionEvent -> imageView1.setImage(twoDlinus));
        twoDsallyButton.setOnAction(actionEvent -> imageView1.setImage(twoDsally));

        threeDsnoopyButton.setOnAction(actionEvent -> imageView1.setImage(threeDsnoopy));
        threeDcharlieButton.setOnAction(actionEvent -> imageView1.setImage(threeDcharlie));
        threeDwoodstockButton.setOnAction(actionEvent -> imageView1.setImage(threeDwoodstock));
        threeDlinusButton.setOnAction(actionEvent -> imageView1.setImage(threeDlinus));
        threeDsallyButton.setOnAction(actionEvent -> imageView1.setImage(threeDsally));

        TwoD.setOnAction(event -> {
            twoDsnoopyButton.setDisable(false);
            twoDcharlieButton.setDisable(false);
            twoDwoodstockButton.setDisable(false);
            twoDlinusButton.setDisable(false);
            twoDsallyButton.setDisable(false);

            threeDsnoopyButton.setDisable(true);
            threeDcharlieButton.setDisable(true);
            threeDwoodstockButton.setDisable(true);
            threeDlinusButton.setDisable(true);
            threeDsallyButton.setDisable(true);
        });

        ThreeD.setOnAction(event -> {
            twoDsnoopyButton.setDisable(true);
            twoDcharlieButton.setDisable(true);
            twoDwoodstockButton.setDisable(true);
            twoDlinusButton.setDisable(true);
            twoDsallyButton.setDisable(true);

            threeDsnoopyButton.setDisable(false);
            threeDcharlieButton.setDisable(false);
            threeDwoodstockButton.setDisable(false);
            threeDlinusButton.setDisable(false);
            threeDsallyButton.setDisable(false);
        });

        bigger.setOnAction(actionEvent -> {
            height = height + 50;
            imageView1.setFitHeight(height);
            imageView1.setFitWidth(height);
        });

        smaller.setOnAction(actionEvent -> {
            height = height - 50;
            imageView1.setFitHeight(height);
            imageView1.setFitWidth(height);
        });

        VBox vbox2 = new VBox (threeDsnoopyButton, threeDcharlieButton, threeDwoodstockButton, threeDlinusButton, threeDsallyButton);
        VBox vbox1 = new VBox (twoDsnoopyButton, twoDcharlieButton, twoDwoodstockButton, twoDlinusButton, twoDsallyButton);
        HBox hbox1 = new HBox (vbox1, vbox2);
        VBox vbox0 = new VBox (imageView1, menuButton);
        HBox hbox3 = new HBox (smaller, bigger);
        VBox vbox3 = new VBox (vbox0, hbox1, hbox3);
        Scene scene = new Scene(vbox3, 1000, 1000);

        primaryStage.setTitle("ImageViewer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}