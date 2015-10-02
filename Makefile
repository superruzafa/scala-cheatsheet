TARGET=README.md

ERB=erb
ERBFLAGS=-T -
DOT=dot
DOTFLAGS=-T$(IMAGEEXT)
IMAGEEXT=png

DOTFILES=$(wildcard src/*.dot)
SCALAFILES=$(wildcard src/*.scala)
IMAGEFILES=$(addprefix images/, $(notdir $(addsuffix .$(IMAGEEXT), $(basename $(DOTFILES)))))

images/%.$(IMAGEEXT): src/%.dot
	$(ERB) $(ERBFLAGS) $< | $(DOT) $(DOTFLAGS) -o $@

all: $(TARGET) $(IMAGEFILES)

$(IMAGEFILES): $(DOTFILES) src/defaults.dot.inc

$(TARGET): src/README.md.erb $(SCALAFILES)
	$(ERB) $(ERBFLAGS) src/README.md.erb > $@
