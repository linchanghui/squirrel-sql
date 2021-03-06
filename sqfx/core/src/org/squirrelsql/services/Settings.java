package org.squirrelsql.services;

public class Settings
{
   private boolean _multibleLinesInCells = false;
   private boolean _limitRowsByDefault = true;
   private int _limitRowsDefault = 100;
   private String _statementSeparator = "GO";

   public boolean isMultibleLinesInCells()
   {
      return _multibleLinesInCells;
   }

   public void setMultibleLinesInCells(boolean multibleLinesInCells)
   {
      _multibleLinesInCells = multibleLinesInCells;
   }

   public boolean isLimitRowsByDefault()
   {
      return _limitRowsByDefault;
   }

   public void setLimitRowsByDefault(boolean limitRowsByDefault)
   {
      _limitRowsByDefault = limitRowsByDefault;
   }

   public int getLimitRowsDefault()
   {
      return _limitRowsDefault;
   }

   public void setLimitRowsDefault(int limitRowsDefault)
   {
      _limitRowsDefault = limitRowsDefault;
   }

   public String getStatementSeparator()
   {
      return _statementSeparator;
   }

   public void setStatementSeparator(String statementSeparator)
   {
      _statementSeparator = statementSeparator;
   }
}
