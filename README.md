# mount-question
ANALYSIS ERROR: Unable to resolve var: cleanup-if-dirty in this context at line 12 of src/mount_question/config.cljs

# the fix

add the following to core.cljs

    (mount/in-cljc-mode)
