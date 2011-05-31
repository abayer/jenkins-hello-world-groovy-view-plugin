import hudson.taglibs.LayoutTagLib

l=namespace(LayoutTagLib)
t=namespace("/lib/hudson")
st=namespace("jelly:stapler")
f=namespace("lib/form")

f.section(title:"Hello World Builder") {
  f.entry(title:"French", description:"Check if we should say hello in French",
          help:"${rootURL}/plugin/hello-world/help-globalConfig.html") {
    f.checkbox(name:"hello_world.useFrench", checked:descriptor.useFrench())
  }
}
