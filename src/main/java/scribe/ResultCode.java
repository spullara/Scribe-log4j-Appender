/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package scribe;


import org.apache.thrift.IntRangeSet;

import java.util.HashMap;
import java.util.Map;

public class ResultCode {
  public static final int OK = 0;
  public static final int TRY_LATER = 1;

  public static final IntRangeSet VALID_VALUES = new IntRangeSet(
      OK,
      TRY_LATER);

  public static final Map<Integer, String> VALUES_TO_NAMES = new HashMap<Integer, String>() {{
    put(OK, "OK");
    put(TRY_LATER, "TRY_LATER");
  }};
}
