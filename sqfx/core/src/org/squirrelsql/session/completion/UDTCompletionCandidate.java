package org.squirrelsql.session.completion;

import org.squirrelsql.session.UDTInfo;
import org.squirrelsql.session.schemainfo.StructItemSchema;

public class UDTCompletionCandidate extends CompletionCandidate
{
   private final UDTInfo _udtInfo;
   private final StructItemSchema _schema;

   public UDTCompletionCandidate(UDTInfo udtInfo, StructItemSchema schema)
   {
      _udtInfo = udtInfo;
      _schema = schema;
   }

   @Override
   public String getReplacement()
   {
      return _udtInfo.getName();
   }

   @Override
   public String getObjectTypeName()
   {
      return "UDT";
   }
}
