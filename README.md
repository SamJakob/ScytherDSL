# Scyther-DSL
A grammar for [Scyther](https://github.com/cascremers/scyther), powered by Eclipse Xtext.

This is currently a work-in-progress intended to add support for Scyther to major
editors with Language Server Protocol (LSP) support.

Presently, it should start up in a copy of Eclipse (or an external editor if you generate
an LSP Server) and valid Scyther scripts should load successfully without errors. (I'm fairly
confident of this, having done a little testing, but there might be some issues still with
niche or deprecated/removed syntaxes).

## Project Structure

This project is an Eclipse workspace, with the set of projects as-generated by Xtext's
Setup Wizard. You can simply open the root directory as an Eclipse workspace. You may have
to install the Xtext SDK add-on (the full SDK) into Eclipse to be able to work with it,
and you can visit [https://www.eclipse.org/Xtext](https://www.eclipse.org/Xtext) to find out
more about Xtext, including instructions and usage guides.

The main grammar can be found in [ScytherDSL/src/com/samjakob/Scyther.xtext](ScytherDSL/src/com/samjakob/Scyther.xtext).
The `validation/` sub-package contains code to run diagnostics (i.e., perform validation
of entered code).

## To-Do List

This is a fairly ambitious to-do list. It is unlikely that all of these features will be met,
and instead, versions will be released as and when a version is considered suitable for general
use.

- [x] Port grammar to Xtext.
- [x] Test warnings (validation) and quick fixes.
- [ ] Semantic Highlighting
- [ ] Information on hover
- [ ] Document Link
- [ ] Rename
- [ ] Snippets (Template Proposals)
- [ ] Formatting

## Credits

All credit for Scyther and it's language goes to [Cas Cremers](https://github.com/cascremers)
and the other project authors.

Please note that this extension is developed under my own set of reverse-domain packages to
indicate that it is an 'unofficial' extension.
