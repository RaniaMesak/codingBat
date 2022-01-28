public String backAround(String string) 
{
  String lastCh = string.substring(string.length() - 1);
  return lastCh + string + lastCh;
}
