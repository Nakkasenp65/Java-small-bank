/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbanksystem;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author nakka
 */
public class FileLocationSaver implements Serializable{
    private static final long serialVersionUID = 1L; 
    private File lastedLoadedFile;

    public FileLocationSaver(File lastedLoadedFile) {
        this.lastedLoadedFile = lastedLoadedFile;
    }

    public File getLastedLoadedFile() {
        return lastedLoadedFile;
    }

    
    
}
