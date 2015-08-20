// automatically generated, do not modify

package com.ragdroid.yo.flatbuffertest.model;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

public final class Tag extends Table {
  public static Tag getRootAsTag(ByteBuffer _bb) { return getRootAsTag(_bb, new Tag()); }
  public static Tag getRootAsTag(ByteBuffer _bb, Tag obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public Tag __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String id() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer idAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String name() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer nameAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public String text() { int o = __offset(8); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer textAsByteBuffer() { return __vector_as_bytebuffer(8, 1); }
  public String title() { int o = __offset(10); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer titleAsByteBuffer() { return __vector_as_bytebuffer(10, 1); }

  public static int createTag(FlatBufferBuilder builder,
      int id,
      int name,
      int text,
      int title) {
    builder.startObject(4);
    Tag.addTitle(builder, title);
    Tag.addText(builder, text);
    Tag.addName(builder, name);
    Tag.addId(builder, id);
    return Tag.endTag(builder);
  }

  public static void startTag(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addOffset(0, idOffset, 0); }
  public static void addName(FlatBufferBuilder builder, int nameOffset) { builder.addOffset(1, nameOffset, 0); }
  public static void addText(FlatBufferBuilder builder, int textOffset) { builder.addOffset(2, textOffset, 0); }
  public static void addTitle(FlatBufferBuilder builder, int titleOffset) { builder.addOffset(3, titleOffset, 0); }
  public static int endTag(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

