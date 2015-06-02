package htl.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

@Generated
public class QueriesGenerated {
  public final boolean NEEDS_OPCONTEXT = false;
  public static Object propertyMacro_GetPropertyValue_1464646648773813413(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df588cbb9L, 0x1453785df58f1ba9L, "url"));
  }
  public static Object propertyMacro_GetPropertyValue_1464646648773287886(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_1464646648773567420(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df588cbb9L, 0x1453785df58efc83L, "extractField")), MetaAdapterFactory.getProperty(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df58efba2L, 0x1453785df58f1b4eL, "regex"));
  }
  public static Object propertyMacro_GetPropertyValue_1464646648773578926(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df588cbb9L, 0x1453785df58efc83L, "extractField")), MetaAdapterFactory.getContainmentLink(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df58efba2L, 0x6076ab00b5f5d4fbL, "innerField")), MetaAdapterFactory.getProperty(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df58f1979L, 0x1453785df58f1b4cL, "regex"));
  }
  public static Object propertyMacro_GetPropertyValue_1464646648773120745(final PropertyMacroContext _context) {
    return "Get" + SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_1464646648773144102(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_1464646648773469885(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df58f59a0L, 0x1453785df59ba281L, "url"));
  }
  public static Object propertyMacro_GetPropertyValue_1464646648773461851(final PropertyMacroContext _context) {
    return "Post" + SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static Object propertyMacro_GetPropertyValue_6717418057876319087(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"));
  }
  public static boolean ifMacro_Condition_1464646648773788188(final IfMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df588cbb9L, 0x1453785df58f5ea0L, "paramsField"))).isNotEmpty();
  }
  public static boolean ifMacro_Condition_1464646648773610267(final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df588cbb9L, 0x1453785df58efc83L, "extractField")) != null);
  }
  public static Iterable<SNode> sourceNodesQuery_1464646648773286683(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df588cbb9L, 0x1453785df58f5ea0L, "paramsField"));
  }
  public static Iterable<SNode> sourceNodesQuery_1464646648773120044(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df5880dbdL, 0x1453785df588d0a1L, "getField"));
  }
  public static Iterable<SNode> sourceNodesQuery_1464646648773143022(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df588cbb9L, 0x1453785df58f5ea0L, "paramsField"));
  }
  public static Iterable<SNode> sourceNodesQuery_1464646648773455553(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), MetaAdapterFactory.getContainmentLink(0x93b576952f9f479dL, 0x90b23a57a5b5ed93L, 0x1453785df5880dbdL, 0x1453785df59ba462L, "postField"));
  }
}
