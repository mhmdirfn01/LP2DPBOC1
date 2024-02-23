#ifndef TABLEDISPLAY_H
#define TABLEDISPLAY_H

#include <vector>
#include "shirt.h"

class TableDisplay {
public:
    std::vector<Shirt> listShirts;

    void tampil();
};

#endif // TABLEDISPLAY_H
