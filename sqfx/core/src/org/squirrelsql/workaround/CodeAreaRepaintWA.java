package org.squirrelsql.workaround;

import javafx.application.Platform;
import org.fxmisc.richtext.CodeArea;

public class CodeAreaRepaintWA
{
   public static void avoidRepaintProblemsAfterTextModification(CodeArea sqlTextArea)
   {
//      sqlTextArea.requestLayout();
//      sqlTextArea.layout();
//
//      Platform.runLater(() -> sqlTextArea.requestLayout());
//      Platform.runLater(() -> sqlTextArea.layout());

   }
}
