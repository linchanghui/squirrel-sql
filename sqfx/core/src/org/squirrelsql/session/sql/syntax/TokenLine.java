package org.squirrelsql.session.sql.syntax;

import org.fife.ui.rsyntaxtextarea.Token;

import java.util.ArrayList;

public class TokenLine
{
   private final ArrayList<Token> _tokens;
   private final String _line;
   private final int _formerInitialTokenType;

   public TokenLine(ArrayList<Token> tokens, String line, int formerInitialTokenType)
   {
      _tokens = tokens;
      _line = line;
      _formerInitialTokenType = formerInitialTokenType;
   }

   public ArrayList<Token> getTokens()
   {
      return _tokens;
   }

   public int getNextInitialTokenType()
   {
      if(0 == _tokens.size())
      {
         return _formerInitialTokenType;
      }

      return _tokens.get(_tokens.size() - 1).getType();
   }

   public int getLineLength()
   {
      return _line.length() + System.lineSeparator().length();
   }
}