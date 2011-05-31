import hudson.taglibs.LayoutTagLib

l=namespace(LayoutTagLib)
t=namespace("/lib/hudson")
st=namespace("jelly:stapler")
f=namespace("lib/form")

f.entry(title:"Name", field:"name") {
  f.textbox()
}

