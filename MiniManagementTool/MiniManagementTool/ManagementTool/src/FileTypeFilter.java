
import java.io.File;
import javax.swing.filechooser.FileFilter;


    class FileTypeFilter extends FileFilter{
        String extension;
        String description;
        public FileTypeFilter (String extension, String description){
            this.extension = extension;
            this.description = description;
        }
        @Override
        public boolean accept(File f) {
            if(f.isDirectory()){
                return true;
            }
            return f.getName().endsWith(extension);
        }

        @Override
        public String getDescription() {
            return description +String.format("(*%s)", extension);
        }
        
    }

