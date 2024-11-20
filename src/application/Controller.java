package application;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Controller implements Initializable {
	@FXML
	private Button playButton, pauseButton;
	
	//Arquivos de Audio:
	private Media media;
	private MediaPlayer mediaPlayer;
	
	private ArrayList<File> songs;
	private File directory;
	private File[] files;
	
	private int songNumber;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		songs = new ArrayList<File>();
		
		directory = new File("music");
		
		files = directory.listFiles();
		
		if (files != null) {
			for (File file : files) {
				songs.add(file);
				System.out.println(file);
			}
		}
		
		media = new Media(songs.get(songNumber).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		
	}
	
	public void playMusic() {
		mediaPlayer.play();
	}
	
	public void pauseMusic() {
		
	}
}
