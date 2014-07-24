package edu.kit.ipd.sdq.xtend2m.api;

import edu.kit.ipd.sdq.xtend2m.api.ImportChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Our prototypical implementation of an ImportChecker.
 * 
 * Allows the usage of an asterisk (*) to match any set of characters.
 */
@SuppressWarnings("all")
public class StarImportChecker implements ImportChecker {
  public boolean check(final String element, final String[] imports) {
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      public Boolean apply(final String it) {
        return Boolean.valueOf(StarImportChecker.this.coveredBy(element, it));
      }
    };
    return IterableExtensions.<String>exists(((Iterable<String>)Conversions.doWrapArray(imports)), _function);
  }
  
  private String[] ownSplit(final String s, final char c) {
    List<String> _xblockexpression = null;
    {
      List<String> result = new ArrayList<String>();
      StringBuilder currentS = new StringBuilder();
      int _length = s.length();
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _length, true);
      for (final int i : _doubleDotLessThan) {
        char _charAt = s.charAt(i);
        boolean _equals = (_charAt == c);
        if (_equals) {
          String _string = currentS.toString();
          result.add(_string);
          StringBuilder _stringBuilder = new StringBuilder();
          currentS = _stringBuilder;
        } else {
          char _charAt_1 = s.charAt(i);
          currentS.append(_charAt_1);
        }
      }
      String _string_1 = currentS.toString();
      result.add(_string_1);
      _xblockexpression = result;
    }
    return ((String[])Conversions.unwrapArray(_xblockexpression, String.class));
  }
  
  private boolean coveredBy(final String element, final String importElement) {
    String[] _ownSplit = this.ownSplit(importElement, '*');
    final Function1<String, String> _function = new Function1<String, String>() {
      public String apply(final String it) {
        return Pattern.quote(it);
      }
    };
    List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(_ownSplit)), _function);
    final String patternString = IterableExtensions.join(_map, ".*");
    return element.matches(patternString);
  }
}
